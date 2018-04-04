package criminal.codedady.com.criminal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;



public class MainActivity extends Activity  {

    private ImageView imagelogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        ImageView find = (ImageView) findViewById(R.id.addcriminal);
        ImageView imagelogo = (ImageView) findViewById(R.id.logomain);
        ImageView searchcriminal=(ImageView) findViewById(R.id.findcriminal);


        find.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        AddProfile.class);
                startActivity(myIntent);
            }
        });

        searchcriminal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Search.class);
                startActivity(myIntent);
            }
        });
    }

}
