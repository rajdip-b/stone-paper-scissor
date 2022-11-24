package com.app.stonepaperscissor.service;

import com.app.stonepaperscissor.misc.Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GameService {

    public String play(String player) {
        var computer = Util.generateChoice();
        var result = Util.assessStatus(player, computer);
        log.info(String.format("Computer's choice: %s, Player's choice: %s", computer, player));
        log.info(String.format("Result: %s", result));
        return result;
    }

}
