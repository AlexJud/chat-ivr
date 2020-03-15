package com.net.dialog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class DialogLogicTest {

    @Test
    void run() {
        Dialog dialog = new DialogLogic();
        dialog.run(null, null);
    }
}
