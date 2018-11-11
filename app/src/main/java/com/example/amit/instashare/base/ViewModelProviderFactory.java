package com.example.amit.instashare.base;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

public class ViewModelProviderFactory<V> implements ViewModelProvider.Factory {

  private final V viewModel;

  public ViewModelProviderFactory(V viewModel) {
    this.viewModel = viewModel;
  }

  @NonNull @Override public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
    if (modelClass.isAssignableFrom(viewModel.getClass())) {
      return (T) viewModel;
    }
    throw new IllegalStateException("Unknown Class Name");
  }
}
