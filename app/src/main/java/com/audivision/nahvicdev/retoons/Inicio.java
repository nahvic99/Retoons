package com.audivision.nahvicdev.retoons;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;


import java.util.Arrays;

public class Inicio extends AppCompatActivity {

    private AccessTokenTracker accessTokenTracker;
    private ProfileTracker profileTracker;
    LoginButton loginButton;
    CallbackManager callbackManager = CallbackManager.Factory.create();
    Profile profile = Profile.getCurrentProfile();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        loginButton = (LoginButton) findViewById(R.id.login_button);

        if (profile != null) {
            // user has logged in
            Intent intentOD = new Intent(Inicio.this, MainActivity.class);
            startActivity(intentOD);
        }
        loginButton.setReadPermissions(Arrays.asList("email", "public_profile"));
        //callback registration
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>()

        {
            @Override
            public void onSuccess(LoginResult loginResult) {
                AccessToken accessToken =loginResult.getAccessToken();
                Intent intentOD = new Intent(Inicio.this, MainActivity.class);
                startActivity(intentOD);



                 /*
 accessTokenTracker= new AccessTokenTracker() {
                    @Override protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken) {

                    }
                };

                loginButton.setReadPermissions("user_friends");
                loginButton.setReadPermissions("public_profile");




                 profileTracker= new ProfileTracker() {
                @Override protected void onCurrentProfileChanged(Profile oldProfile, Profile currentProfile) {

                }
                };


                */

            }



            @Override
            public void onCancel() {
                Context context = getApplicationContext();
                CharSequence text = "No pudiste loguearte, intentalo de nuevo!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }

            @Override
            public void onError(FacebookException exception) {
                Context context = getApplicationContext();
                CharSequence text = "No pudiste loguearte, intentalo de nuevo!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }


   public void onDestroy() {
        super.onDestroy();
        // We stop the tracking before destroying the activity
      //  accessTokenTracker.stopTracking();
    }


}

