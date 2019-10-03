/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.awt.Color;

/**
 *
 * @author Anh Vu Truong Nguyen
 */
public class Ball {
    private final String BoardIndex;
    
    public Ball (String BoardIndex) {
        this.BoardIndex = BoardIndex;
    }
    
    public String getBoardIndex () {
        return BoardIndex;
    }
}
