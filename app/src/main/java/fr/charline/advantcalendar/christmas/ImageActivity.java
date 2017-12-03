package fr.charline.advantcalendar.christmas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import fr.charline.advantcalendar.R;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        final Bundle bundle  = getIntent().getExtras();
        if(bundle != null) {
            final String imageId = bundle.getString("imageId");
            final ImageView imageview  = (ImageView)findViewById(R.id.imageView);
            int resID = getResources().getIdentifier(getPackageName()+":drawable/"+ imageId, null, null);
            imageview.setImageResource(resID);
        }
    }
}
