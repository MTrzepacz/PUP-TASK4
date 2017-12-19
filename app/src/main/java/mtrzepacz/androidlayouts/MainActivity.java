package mtrzepacz.androidlayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonFrame,buttonLinearHorizontal,buttonTable,buttonGrid,buttonRelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFrame = (Button) findViewById(R.id.buttonFrameLayout);
        buttonFrame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),FrameLayout.class);
                startActivity(intent);
            }
        });
        buttonLinearHorizontal = (Button) findViewById(R.id.buttonLinearLayoutHorizontal);
        buttonLinearHorizontal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),HorizontalLayout.class);
                startActivity(intent);
            }
        });
        buttonTable = (Button) findViewById(R.id.buttonTableLayout);
        buttonTable.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),TableLayout.class);
                startActivity(intent);
            }
        });
        buttonGrid = (Button) findViewById(R.id.buttonGridLayout);
        buttonGrid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),GridLayout.class);
                startActivity(intent);
            }
        });
        buttonRelative = (Button) findViewById(R.id.buttonRelativeLayout);
        buttonRelative.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),RelativeLayout.class);
                startActivity(intent);
            }
        });

    }
}
