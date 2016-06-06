package com.rapariscode.petgram.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rapariscode.petgram.MainActivity;
import com.rapariscode.petgram.R;
import com.rapariscode.petgram.adapter.MascotaAdaptador;
import com.rapariscode.petgram.pojo.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {

    private RecyclerView listadoMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragment( ) {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        mascotas = new ArrayList<Mascota>();
        mascotas.add( new Mascota("Jacky", R.drawable.mascota01, 3));
        mascotas.add( new Mascota("Duquesa", R.drawable.mascota02, 2));
        mascotas.add( new Mascota("Kiddo", R.drawable.mascota03, 5));
        mascotas.add( new Mascota("Snoopy", R.drawable.mascota04, 4 ));
        mascotas.add( new Mascota("TopCat", R.drawable.mascota05, 1 ));
        mascotas.add( new Mascota("Pastor", R.drawable.mascota06, 3 ));
        mascotas.add( new Mascota("Killer", R.drawable.mascota07, 3 ));
        mascotas.add( new Mascota("Juancho", R.drawable.mascota08, 4 ));

        listadoMascotas = (RecyclerView) v.findViewById( R.id.recyclerViewMascotas );
        LinearLayoutManager llm = new LinearLayoutManager( v.getContext() );
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listadoMascotas.setLayoutManager( llm );

        MascotaAdaptador adaptador = new MascotaAdaptador( mascotas );
        listadoMascotas.setAdapter( adaptador );

        return v;
    }

}
