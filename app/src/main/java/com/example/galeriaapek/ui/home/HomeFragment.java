package com.example.galeriaapek.ui.home;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.galeriaapek.R;
import com.example.galeriaapek.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    int id = 1;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        int[] tab = {R.drawable.tailwind,R.drawable.go,R.drawable.figma,R.drawable.svelte,
                R.drawable.vercel,R.drawable.java,R.drawable.ic_menu_camera};

        String[] tabString = {"tailwindoihugyfuvgfuygu7t8f67tuygf67dtcfuygfuuctg jhviyuctgvjuvyuvucvguhiugivyfuctyuyuvyctuyxrctvyuctrvubvyuctrxcyvutcrxcvyctfxrcyvutcrcyvugftcryvubvtcryvu","go","figma","svelte","vercel","java","ic"};


        binding.button.setOnClickListener(v -> {
            id -= 1;
            binding.button2.setEnabled(true);
            if (id == 0){
                binding.button.setEnabled(false);
            } else {
                binding.button.setEnabled(true);
            }
            binding.textView2.setText(tabString[id]);
            binding.imageView2.setImageResource(tab[id]);
        });

        binding.button2.setOnClickListener(v -> {
            id += 1;
            binding.button.setEnabled(true);
            if (id == 6){
                binding.button2.setEnabled(false);
            } else {
                binding.button2.setEnabled(true);
            }
            binding.textView2.setText(tabString[id]);
            binding.imageView2.setImageResource(tab[id]);
        });



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    }