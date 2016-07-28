package org.jfaster.mango.welcome.dao;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.ReturnGeneratedId;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.welcome.model.Welcome;

@DB(table = "welcome")
public interface WelcomeDAO {
	String COLUMNS = "name";

    String ALL_COLUMNS = "id" + "," + COLUMNS;

    @ReturnGeneratedId
    @SQL("insert into #table(" + COLUMNS + ") values(:id, :name)")
    int addWelcome(Welcome welcome);

    @SQL("select " + ALL_COLUMNS + " from #table where id = :1")
    Welcome getWelcome(int id);

    @SQL("update #table set name=:name where id = :id")
    boolean updateWelcome(Welcome welcome);

    @SQL("delete from #table where id = :1")
    boolean deleteWelcome(int id);
}