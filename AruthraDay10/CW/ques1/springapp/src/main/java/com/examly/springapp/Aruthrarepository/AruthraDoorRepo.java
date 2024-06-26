package com.examly.springapp.Aruthrarepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Aruthramodel.AruthraDoor;

// import jakarta.transaction.Transactiona

@Repository
public interface AruthraDoorRepo extends JpaRepository<AruthraDoor, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<AruthraDoor> findByColor(String color);

    public List<AruthraDoor> findByDoorType(String doortype);
}
