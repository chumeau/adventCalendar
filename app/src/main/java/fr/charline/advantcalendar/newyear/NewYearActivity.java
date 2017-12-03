package fr.charline.advantcalendar.newyear;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

import fr.charline.advantcalendar.R;

public class NewYearActivity extends AppCompatActivity {

    TextView horloge = null;
    long milli;
    long sec;
    long min;
    long heure;
    long jour;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_year);
        horloge = findViewById(R.id.horloge);
        final Calendar fin = Calendar.getInstance();
        fin.set(2018, 0, 1, 0, 0, 0);
        final Calendar maintenant = Calendar.getInstance();
        long diff = fin.getTimeInMillis() - maintenant.getTimeInMillis();
        final MyCount counter = new MyCount(diff,1000);
        counter.start();
    }
    //countdowntimer is an abstract class, so extend it and fill in methods
    public class MyCount extends CountDownTimer {
        MyCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            milli = millisUntilFinished % 1000;
            sec = ((millisUntilFinished - milli)/ 1000) % 60;
            min = ((millisUntilFinished - milli - sec)/ (1000 * 60) % 60);
            heure = ((millisUntilFinished - milli - sec - min)/ (1000 * 60 * 60) % 24);
            jour = ((millisUntilFinished - milli - sec - min - heure)/ (1000 * 60 * 60 * 24));
            final StringBuilder builder = new StringBuilder();
            if (jour == 0) {
                builder.append(String.format(Locale.FRANCE, "%dh %dmin %dsec", heure, min, sec));
            } else if (jour == 1) {
                builder.append(String.format(Locale.FRANCE, "%d jours %dh %dmin %dsec", jour, heure, min, sec));
            } else  {
                builder.append(String.format(Locale.FRANCE, "%d jours %dh %dmin %dsec", jour, heure, min, sec));
            }
            horloge.setText(builder.toString());
        }

        @Override
        public void onFinish() {
            horloge.setText(R.string.bonne_annee);
        }
    }
}
