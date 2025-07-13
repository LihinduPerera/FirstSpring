package dev.lihindu.firstspring.run;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface RunRepository extends ListCrudRepository<Run, Integer> { //"<Run, Integer>" in this , we use Integer because Run's id type is int , that's why.
    List<Run> findAllByLocation (String location); //custom Spring data. to implement own query you can use @Query to...
}
