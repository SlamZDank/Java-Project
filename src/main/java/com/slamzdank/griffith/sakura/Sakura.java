package com.slamzdank.griffith.sakura;

import elements.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import UI.*;
// import elements.*;

/**
 * @authors SlamZDank, Griffith000
 */

public class Sakura {
  public static void main(String[] args) {
    /* Etudiant e = new Etudiant("Slama","Med Amine","23 / 02 / 2003"); */
    Connection con = null;
    try {
      con = DB.getConnection();
    } catch (Exception e) {
      return;
    }
    Login l = new Login(con);
    l.setVisible(true);
    l.pack();
    l.setLocationRelativeTo(null);
  }
}
