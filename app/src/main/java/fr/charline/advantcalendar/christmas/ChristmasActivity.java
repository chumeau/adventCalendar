package fr.charline.advantcalendar.christmas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import fr.charline.advantcalendar.R;

public class ChristmasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christmas);
    }

    public void onClickDefault(final View view, final Class c, final Bundle bundle) {
        Intent intent = new Intent(ChristmasActivity.this, c);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    public void onClickDefault(final View view, final Class c) {
        onClickDefault(view, c, null);
    }

    public void onClick1(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("01/12/2017"))) {
                onClickDefault(view, GifActivity.class);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick2(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("02/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("url",
                        "http://www.marieclaire.fr/idees/de-jolies-couronnes-de-noel,2610261,1008271.asp");
                onClickDefault(view, WebActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick3(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("03/12/2017"))) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=DOL-pehfAXQ")));
                Log.i("Video", "Video disney christmas playing....");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick4(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("04/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("imageId", "gift");
                onClickDefault(view, ImageActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick5(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("05/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("imageId", "enfance_noel");
                onClickDefault(view, ImageActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick6(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("06/12/2017"))) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=Z8IQhMMlpnY")));
                Log.i("Video", "Video Playing....");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick7(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("07/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("url",
                        "https://www.lesepicesrient.fr/12/2012/foie-gras-maison-version-poche-recette-facile-pour-un-foie-gras-divin/");
                onClickDefault(view, WebActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick8(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("08/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("url",
                        "http://www.espacefrancais.com/les-legendes-et-les-histoires-de-noel");
                onClickDefault(view, WebActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick9(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("09/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("imageId", "boules_noel");
                onClickDefault(view, ImageActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick10(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("10/12/2017"))) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(
                        "https://www.youtube.com/watch?v=hn3wJ1_1Zsg&list=RDMMhn3wJ1_1Zsg")));
                Log.i("Video", "Video Playing....");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick11(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("11/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("url",
                        "http://www.creavea.com/noel_fabriquer-une-guirlande-de-noel-en-bois_fiches-conseils_5835-0.html");
                onClickDefault(view, WebActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick12(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("12/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("url", "https://www.mannele.net/recette/");
                onClickDefault(view, WebActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick13(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("13/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("url",
                        "http://chefsimon.lemonde.fr/gourmets/chef-simon/recettes/buche-de-noel-a-la-framboise");
                onClickDefault(view, WebActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick14(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("14/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("url",
                        "http://www.creavea.com/paquet-cadeau_faire-un-paquet-cadeau-en-kraft_fiches-conseils_5851-0.html");
                onClickDefault(view, WebActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick15(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("15/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("imageId", "gift");
                onClickDefault(view, ImageActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick16(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("16/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("imageId", "poupee_noel");
                onClickDefault(view, ImageActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick17(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("17/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("url", "http://www.cakeandallie.com/2011/12/gingerbread-men/");
                onClickDefault(view, WebActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick18(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("18/12/2017"))) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=ejc0Jeebodo")));
                Log.i("Video", "Video Playing....");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick19(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("19/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("url", "https://www.bredele.fr/spirales-chocolat-pistache");
                onClickDefault(view, WebActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick20(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("20/12/2017"))) {
                final Bundle bundle = new Bundle();
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=F317SFf95ms")));
                Log.i("Video", "Video Playing....");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick21(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("21/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("imageId", "colmar_noel");
                onClickDefault(view, ImageActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick22(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("22/12/2017"))) {
                final Bundle bundle = new Bundle();
                bundle.putString("url",
                        "https://www.jamieoliver.com/news-and-features/features/homemade-christmas-crackers/");
                onClickDefault(view, WebActivity.class, bundle);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick23(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("23/12/2017"))) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=5tXht-NGmc0")));
                Log.i("Video", "Video Playing....");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick24(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("24/12/2017"))) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=phGnFF0KyhQ")));
                Log.i("Video", "Video Playing....");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onClick25(final View view) {
        try {
            if (this.getCurrentDate().after(this.getDateFromString("25/12/2017"))) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=eVfeXJ841iE")));
                Log.i("Video", "Video Playing....");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private Date getCurrentDate() {
        return Calendar.getInstance().getTime();
    }

    private Date getDateFromString(final String date) throws ParseException {
        return new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE).parse(date);
    }
}
