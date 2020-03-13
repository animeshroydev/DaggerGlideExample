package com.animesh.roy.daggerglideexample.di;

import com.animesh.roy.daggerglideexample.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

   @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

}
