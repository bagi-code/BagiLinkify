package com.bagicode.www.bagilinkify;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.judul);

        textView.setText("http://www.bagicode.com/ dan 0857581456");
        Linkify.addLinks(textView, Linkify.WEB_URLS | Linkify.PHONE_NUMBERS);
//
//        textView.setText("085758145***");
//        Linkify.addLinks(textView, Linkify.PHONE_NUMBERS);
//
//        textView.setText("Antasari, Jakarta Selatan, Indonesia");
//        Linkify.addLinks(textView, Linkify.MAP_ADDRESSES);
//
//        textView.setText("bagicode@gmail.com");
//        Linkify.addLinks(textView , Linkify.EMAIL_ADDRESSES);
//
//        textView.setText("Ayo kunjungi http://www.bagicode.com/ untuk mendapatkan tutorial terbaru" +
//                " dan kalian bisa request tutorial ke email bagicode@gmail.com atau bisa juga" +
//                " dengan langsung bertemu kami face to face di Jalan Antasari,Jakarta Selatan,Indonesia" +
//                " jika Ada yang kurang jelas silahkan hub kami di 0857581456");
//        Linkify.addLinks(textView , Linkify.ALL);

//        textView.setText("bagicode@gmail.com dan 0857581456");
//        Linkify.addLinks(textView , Linkify.EMAIL_ADDRESSES | Linkify.PHONE_NUMBERS);
//
//        Pattern pattern = Pattern.compile("[a-zA-Z]+&");
//        textView.setText("press Linkify& or on Android& to search it on google");
//        Linkify.addLinks(textView,pattern, "http://www.google.ie/search?q=");
//
//        Linkify.MatchFilter myMatchFilter = new Linkify.MatchFilter() {
//            @Override
//            public boolean acceptMatch(CharSequence cs, int start, int end) {
//                return start > 48;
//            }
//        };
//        Pattern pattern2 = Pattern.compile("[a-zA-Z]+");
//        textView.setText("press one of these words to search it on google: Android Linkify dzone");
//        Linkify.addLinks(textView,pattern2, "http://www.google.ie/search?q=", myMatchFilter, null);
//
//        Linkify.TransformFilter myTransformFilter = new Linkify.TransformFilter() {
//            @Override
//            public String transformUrl(Matcher match, String url) {
//                return url.substring(1);
//            }
//        };
//
//        Pattern pattern3 = Pattern.compile("\\$[a-zA-Z]+");
//        textView.setText("press $Linkify or on $Android to search it on google");
//        Linkify.addLinks(textView,pattern3, "http://www.google.ie/search?q=", null, myTransformFilter);

    }
}
