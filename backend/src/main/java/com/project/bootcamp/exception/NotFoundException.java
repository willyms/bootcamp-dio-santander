package com.project.bootcamp.exception;

import com.project.bootcamp.util.*;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
