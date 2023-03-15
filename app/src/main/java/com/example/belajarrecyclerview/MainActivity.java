package com.example.belajarrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<DataModel> dataModels = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        adapter = new Adapter(dataModels);

        //set recycler view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        //set adapter
        recyclerView.setAdapter(adapter);

        //isi data
        dataModels.add(new DataModel(R.drawable.pondokindah,"Rumah Sakit Pondok Indah","Jl. Metro Duta Niaga Blok B No. 9, Pondok Indah, Jakarta Selatan","12310 - (021) 765 7525"));
        dataModels.add(new DataModel(R.drawable.medistra,"Rumah Sakit Medistra","Jl. Jendral Gatot Subroto Kav. 59, Jakarta Selatan", "12950 - (021) 5210200"));
        dataModels.add(new DataModel(R.drawable.mmc,"Rumah Sakit MMC ","Jl. Pangeran Diponegoro No. 71, Jakarta Pusat", "10430 - (021) 3140200"));
        dataModels.add(new DataModel(R.drawable.pertamina,"Rumah Sakit Pertamina","Jl. Kyai Maja No. 57, Kebayoran Baru, Jakarta Selatan", "12120 - (021) 7221527"));
        dataModels.add(new DataModel(R.drawable.cinere,"Rumah Sakit Puri Cinere","Jl. Cinere Raya No. 1, Depok, Jawa Barat","16514 - (021) 7545555"));
        dataModels.add(new DataModel(R.drawable.rscm,"Rumah Sakit Cipto Mangunkusumo"," Jl. Pangeran Diponegoro No. 71, Jakarta Pusat" , "10430 - (021) 3143435"));
        dataModels.add(new DataModel(R.drawable.pluit2,"Rumah Sakit Pluit"," Jl. Pluit Selatan Raya No. 1, Jakarta Utara" , " 14450 - (021) 6606125"));



        adapter.notifyDataSetChanged();

    }
}