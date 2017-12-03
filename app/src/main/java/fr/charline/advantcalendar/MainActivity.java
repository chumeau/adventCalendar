package fr.charline.advantcalendar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import fr.charline.advantcalendar.christmas.ChristmasActivity;
import fr.charline.advantcalendar.newyear.NewYearActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Redirige vers l'activité calendrier de Noël.
     *
     * @param view La {@link View} actuelle.
     */
    public void onClickChristmas(final View view) {
        final Intent intent = new Intent(MainActivity.this, ChristmasActivity.class);
        startActivity(intent);
    }

    /**
     * Redirige vers l'activité Nouvel An.
     *
     * @param view La {@link View} actuelle.
     */
    public void onClickNewYear(final View view) {
        final Intent intent = new Intent(MainActivity.this, NewYearActivity.class);
        startActivity(intent);
    }
}
