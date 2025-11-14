package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("treasure")
public interface TreasureService {

    String ouvrir();

}
