package in.arunprabhakar.popularmovies;

import java.util.List;

/*
*
* This interface created to implement
* a call back function that returns results
* from Async task
*
* */

public interface AsyncResponse {

    void onTaskCompleted( List<Movie> results );

}
