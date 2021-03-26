package nl.isaac.devblog.awselasticbeanstalkapp.startwars.api.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import nl.isaac.devblog.awselasticbeanstalkapp.startwars.api.data.FilmsData;
import nl.isaac.devblog.awselasticbeanstalkapp.starwars.api.models.Film;
import nl.isaac.devblog.awselasticbeanstalkapp.starwars.api.web.FilmsApi;

@RestController
public class FilmsResource implements FilmsApi {
    @Override
    public ResponseEntity<List<Film>> registerPatient() {
        return ResponseEntity.ok().body(FilmsData.films);
    }
}
