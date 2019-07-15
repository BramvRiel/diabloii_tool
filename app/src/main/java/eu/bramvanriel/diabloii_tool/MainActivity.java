package eu.bramvanriel.diabloii_tool;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Locale.ENGLISH;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_CLASS_NAME = "eu.bramvanriel.diabloii_tool.CLASS";
    private TextView speechResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speechResult = (TextView) findViewById(R.id.textView2);
        Button button = (Button) findViewById(R.id.class_btn_druid);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Bundle extras = new Bundle();
                extras.putString(EXTRA_CLASS_NAME,getString(R.string.class_druid_name));
                Intent intent = new Intent(getApplicationContext(),ClassActivity.class);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
        Button button1 = (Button) findViewById(R.id.textToSpeech);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeSpeechInput(v);
            }
        });
    }

    public void writeSpeechInput(View view) {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, ENGLISH);

        if(intent.resolveActivity(getPackageManager())!=null) {
            startActivityForResult(intent, 10);
        } else{
            Toast.makeText(this,"Speech input is not supported on your device.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case 10:
                if(resultCode==RESULT_OK && data != null) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    speechResult.setText(result.get(0));
                }
                break;
        }
    }
}
