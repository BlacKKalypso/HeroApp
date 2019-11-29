package com.crea.heroapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.crea.heroapp.R;
import com.crea.heroapp.models.Hero;
import com.squareup.picasso.Picasso;

public class ProfileHeroFragment extends Fragment {

    private Hero hero;

    public ProfileHeroFragment(Hero hero) {
        this.hero = hero;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile_hero_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView nomHero = view.findViewById(R.id.textViewHeroName);
        nomHero.setText((hero.getName()));

        TextView idHero = view.findViewById(R.id.textViewHeroId);
        idHero.setText("Id Hero: ");
        idHero.append(Long.toString(hero.getId()));

        TextView powerHero = view.findViewById(R.id.textViewHeroPower);
        powerHero.setText("Hero power: ");
        powerHero.append(hero.getPower());

        ImageView imageHero = view.findViewById(R.id.imageViewHeroProfile);
        Picasso.get().load(hero.getImage()).into(imageHero);
    }
}
