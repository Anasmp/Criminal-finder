package criminal.codedady.com.criminal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import in.galaxyofandroid.spinerdialog.OnSpinerItemClick;
import in.galaxyofandroid.spinerdialog.SpinnerDialog;

public class AddProfile extends AppCompatActivity {

    ArrayList<String> items=new ArrayList<>();
    SpinnerDialog spinnerDialog;
    EditText input_edit2;
    Button spinner;



    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Add Profile");
        setContentView(R.layout.activity_add_profile);

        RelativeLayout imagebtn = (RelativeLayout) findViewById(R.id.imageButton);
        imageView  = (ImageView) findViewById(R.id.profile_image);

        initItems();
        spinner =(Button)findViewById(R.id.spinner);


        spinnerDialog = new SpinnerDialog(AddProfile.this,items,"Select Station");
        spinnerDialog.bindOnSpinerListener(new OnSpinerItemClick() {
            @Override
            public void onClick(String item, int position) {
                Toast.makeText(AddProfile.this,"selected: " + item,Toast.LENGTH_SHORT).show();
                spinner.setText(item);
            }
        });



        spinner.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               spinnerDialog.showSpinerDialog();
           }
       });

    imagebtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, 0);

        }
    });

    }

    private void initItems() {

        items.add("Mumbai");
        items.add("Delhi");
        items.add("Bengaluru");
        items.add("Hyderabad");
        items.add("Ahmedabad");
        items.add("Chennai");
        items.add("Kolkata");
        items.add("Surat");
        items.add("Pune");
        items.add("Jaipur");
        items.add("Lucknow");
        items.add("Kanpur");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bitmap =(Bitmap)data.getExtras().get("data");
        imageView.setImageBitmap(bitmap);

    }

}
