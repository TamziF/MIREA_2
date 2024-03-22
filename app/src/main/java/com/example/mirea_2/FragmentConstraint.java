package com.example.mirea_2;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mirea_2.databinding.FragmentConstraintBinding;

public class FragmentConstraint extends Fragment {

    private final String LIFECYCLE_TAG = "LIFECYCLE_CONSTRAINT";

    private FragmentConstraintBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(LIFECYCLE_TAG, "onCreate");
        Toast.makeText(requireContext(), "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentConstraintBinding.inflate(inflater, container, false);

        getParentFragmentManager().setFragmentResultListener(getString(R.string.linearConstraint_request_key),
                this, (requestKey, result) -> {
                    Log.d("HEISEN", "salam");
                    String resultString = result.getString(getString(R.string.fromLinearToConstraint_bundle_key));
                    binding.resultText.setText(resultString);
                });

        binding.buttonBack.setOnClickListener(v -> {
            Log.v("HEISEN", "hello");

            Bundle result = new Bundle();
            String resultValue = binding.editText.getText().toString();
            result.putString(getString(R.string.fromConstraintToLinear_bundle_key), resultValue);
            getParentFragmentManager().setFragmentResult(getString(R.string.constraintLinear_request_key), result);
        });

        Log.i(LIFECYCLE_TAG, "onCreateView");
        Toast.makeText(requireContext(), "onCreateView", Toast.LENGTH_SHORT).show();

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.i(LIFECYCLE_TAG, "onViewCreated");
        Toast.makeText(requireContext(), "onViewCreated", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);

        Log.i(LIFECYCLE_TAG, "onViewStateRestored");
        Toast.makeText(requireContext(), "onViewStateRestored", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.i(LIFECYCLE_TAG, "onStart");
        Toast.makeText(requireContext(), "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.i(LIFECYCLE_TAG, "onResume");
        Toast.makeText(requireContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.i(LIFECYCLE_TAG, "onPause");
        Toast.makeText(requireContext(), "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();

        Log.i(LIFECYCLE_TAG, "onStop");
        Toast.makeText(requireContext(), "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.i(LIFECYCLE_TAG, "onSaveInstanceState");
        Toast.makeText(requireContext(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        Log.i(LIFECYCLE_TAG, "onDestroyView");
        Toast.makeText(requireContext(), "onDestroyView", Toast.LENGTH_SHORT).show();
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i(LIFECYCLE_TAG, "onDestroy");
        Toast.makeText(requireContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}