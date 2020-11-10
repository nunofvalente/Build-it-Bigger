package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.nunovalente.android.jokeprovider.JokeProvider;

import java.util.List;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that returns a joke */
    @ApiMethod(name = "getMyJoke")
    public Joke getMyJoke() {
        String joke = JokeProvider.getJoke();
        Joke response = new Joke();
        response.setData(joke);

        return response;
    }

}
