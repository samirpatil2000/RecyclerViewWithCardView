package com.example.a41_recyclerstaggeredview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Number of columns that we want in recycler View
    private static final int NUM_COLUMNS = 1 ;


    private ArrayList<String> gImageUrls= new ArrayList<>();
    private ArrayList<String> gNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initzBitmap();


    }
    public void initzBitmap() {


//        gImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
//        gNames.add("Havasu Falls");


        gImageUrls.add("https://images.unsplash.com/photo-1518144591331-17a5dd71c477?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Sea");

        gImageUrls.add("https://images.unsplash.com/photo-1536107026912-d993e101312f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Sunflower");


        gImageUrls.add("https://images.unsplash.com/photo-1581475644113-365279acdadb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Grey Flower");

        gImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        gNames.add("Ice");

        gImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        gNames.add("Falls");

        gImageUrls.add("https://images.unsplash.com/photo-1500336866626-5a47b3158a48?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Red Rose");

        gImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        gNames.add("Rocky Mountain National Park");

        gImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        gNames.add("Sea Blue");

        gImageUrls.add("https://images.unsplash.com/12/till-the-cows-come-home.jpg?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Golden Hour");

        gImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        gNames.add("Frozen Lake");


        gImageUrls.add("https://images.unsplash.com/photo-1580579860154-f6b83cdd6543?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Pink Flamingo");


        gImageUrls.add("https://images.unsplash.com/photo-1420593248178-d88870618ca0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80");
        gNames.add("Greenish Tree");

        gImageUrls.add("https://images.unsplash.com/photo-1522277245807-5e608aa8adcd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Blue Parrot");

        gImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        gNames.add("White Sands Desert");

        gImageUrls.add("https://images.unsplash.com/photo-1475598322381-f1b499717dda?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Lava");


        gImageUrls.add("https://images.unsplash.com/photo-1575477690186-2c9d7e60dee2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Reddish");

        gImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        gNames.add("Lighting");

        gImageUrls.add("https://images.unsplash.com/photo-1518910666495-4cfbf7eb7663?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Ocean Island ");

        gImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        gNames.add("Falls");

        gImageUrls.add("https://images.unsplash.com/photo-1520218294431-9f7f6e02c49c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Mountain");

        gImageUrls.add("https://images.unsplash.com/photo-1522764725576-4cbbbf12c16d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Red Tree");

        gImageUrls.add("https://images.unsplash.com/photo-1567958115409-d938cf0ea72e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Grey");

        gImageUrls.add("https://images.unsplash.com/photo-1529650867973-7d752b68d950?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Pink Flower");

        gImageUrls.add("https://images.unsplash.com/photo-1529758597842-15d98e72705b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        gNames.add("Map");


        initRecyclerView();

    }
    private void initRecyclerView(){

        RecyclerView recyclerView= findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,gNames,gImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}
