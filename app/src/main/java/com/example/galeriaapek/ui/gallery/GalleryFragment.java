package com.example.galeriaapek.ui.gallery;

import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.galeriaapek.R;
import com.example.galeriaapek.databinding.FragmentGalleryBinding;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.id3.setOnClickListener(v -> {
            if ((binding.id5.isChecked())){
                if (!(binding.id2.getText()).toString().isEmpty()) {
                    Toast.makeText(getActivity(), (binding.id2.getText()).toString(),
                            Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getActivity(), "Nie wpisano tekstu",
                            Toast.LENGTH_LONG).show();
                }
            }else{
                if (!(binding.id2.getText()).toString().isEmpty()) {
                    Snackbar id4 = Snackbar.make(root.getRootView(), (binding.id2.getText()).toString(),
                            BaseTransientBottomBar.LENGTH_SHORT);
                    id4.show();
                }else{
                    Snackbar id4 = Snackbar.make(root.getRootView(), "Nie wpisano tekstu",
                        BaseTransientBottomBar.LENGTH_SHORT);
                    id4.show();
                }


            }

        });



        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}