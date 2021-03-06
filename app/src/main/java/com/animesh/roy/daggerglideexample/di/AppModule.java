package com.animesh.roy.daggerglideexample.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.animesh.roy.daggerglideexample.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

   @Provides
    static RequestOptions provideRequestOptions() {
       return RequestOptions.placeholderOf(R.drawable.background).error(R.drawable.background);
   }

   @Provides
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions) {
       return Glide.with(application).setDefaultRequestOptions(requestOptions);
   }

   @Provides
    static Drawable provideAppDrawable(Application application) {
       return ContextCompat.getDrawable(application, R.drawable.icon);
   }

}
