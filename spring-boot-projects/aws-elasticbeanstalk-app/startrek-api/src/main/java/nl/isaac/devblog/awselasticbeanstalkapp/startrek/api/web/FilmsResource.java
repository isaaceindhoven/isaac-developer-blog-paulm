package nl.isaac.devblog.awselasticbeanstalkapp.startrek.api.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import nl.isaac.devblog.awselasticbeanstalkapp.startrek.api.data.FilmsData;
import nl.isaac.devblog.awselasticbeanstalkapp.startrek.api.models.Film;

@RestController
public class FilmsResource implements FilmsApi {
    @Override
    public ResponseEntity<List<Film>> registerPatient() {
        return ResponseEntity.ok().body(FilmsData.films);
    }
}
