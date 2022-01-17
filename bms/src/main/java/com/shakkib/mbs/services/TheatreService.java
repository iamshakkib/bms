package com.shakkib.mbs.services;

import com.shakkib.mbs.exceptions.TheatreDetailsNotFoundException;
import com.shakkib.mbs.entities.Theatre;

import java.util.List;

public interface TheatreService {

    public Theatre acceptTheatreDetails(Theatre theatre);
    public Theatre getTheatreDetails(int id) throws TheatreDetailsNotFoundException;
    public Theatre updateTheatreDetails(int id, Theatre theatre) throws TheatreDetailsNotFoundException;
    public boolean deleteTheatre(int id) throws TheatreDetailsNotFoundException;
    public List<Theatre> getAllTheatreDetails();
}
