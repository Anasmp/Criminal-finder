package criminal.codedady.com.criminal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;

public class Login extends Activity {


    Animation slideright;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);



        CardView signinButton = (CardView) findViewById(R.id.signbutton);
        slideright = AnimationUtils.loadAnimation(this,R.anim.slideright);
        signinButton.setAnimation(slideright);

        ImageView logo =(ImageView) findViewById(R.id.logomain);
        logo.setAnimation(slideright);

        EditText input_email=(EditText) findViewById(R.id.input_email);
        input_email.setAnimation(slideright);


        EditText input_email2=(EditText) findViewById(R.id.input_email2);
        input_email2.setAnimation(slideright);

        signinButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Login.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

    }


}
