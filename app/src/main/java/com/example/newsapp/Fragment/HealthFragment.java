package com.example.newsapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newsapp.Adapter.Adapter;
import com.example.newsapp.Api.ApiUtilities;
import com.example.newsapp.Models.MainNews;
import com.example.newsapp.Models.ModelClass;
import com.example.newsapp.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HealthFragment extends Fragment {

    String api = "be1902a8ea584d5a80131cb5f2fac899";
    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;
    String country = "in";
    private RecyclerView recyclerViewofhealth;
    private String category = "health";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_health, container, false);


        recyclerViewofhealth = view.findViewById(R.id.recyclerviewofhealth);
        modelClassArrayList = new ArrayList<ModelClass>();
        recyclerViewofhealth.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(),modelClassArrayList);
        recyclerViewofhealth.setAdapter(adapter);

        findNews();


        return view;
    }

    private void findNews() {

        ApiUtilities.getApiInterface().getCategoryNews(country,category,100,api).enqueue(new Callback<MainNews>() {
            @Override
            public void onResponse(Call<MainNews> call, Response<MainNews> response) {
                if(response.isSuccessful())
                {
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<MainNews> call, Throwable t) {

            }
        });
    }

}