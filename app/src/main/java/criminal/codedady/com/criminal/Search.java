package criminal.codedady.com.criminal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import in.galaxyofandroid.spinerdialog.OnSpinerItemClick;
import in.galaxyofandroid.spinerdialog.SpinnerDialog;

public class Search extends AppCompatActivity {


    ImageView imageView;

    ImageView searchbutton;

    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Search");
        setContentView(R.layout.activity_search);
        searchbutton =(ImageView) findViewById(R.id.search_button);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        searchbutton.setAnimation(frombottom);

        ImageView imagebtn = (ImageView) findViewById(R.id.imagehead);
        imageView  = (ImageView) findViewById(R.id.criminalimage);


        imagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bitmap =(Bitmap)data.getExtras().get("data");
        imageView.setImageBitmap(bitmap);

    }
}
