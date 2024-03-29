package com.cm.projetoFinal.ui.main.interfaces;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;

public interface FragmentChanger {
    void addFragment(Class<? extends Fragment> fragment, boolean addToBackStack);

    void replaceFragment(Class<? extends Fragment> fragment, boolean addToBackStack);

    void addFragment(Class<? extends Fragment> fragment, String tag, boolean addToBackStack);

    void replaceFragment(Class<? extends Fragment> fragment, String tag, boolean addToBackStack);

    void popBackStack();

    <T extends ViewModel> T getViewModel(Class<T> viewModel);
}