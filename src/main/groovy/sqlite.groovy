package me.zhihan.glabs

import groovy.sql.Sql
import org.sqlite.SQLite
/** Simple wrapper over SQLite JDBC driver  */

class SQLiteMain {
	static void main(String[] args) {
		def sql = Sql.newInstance( 'jdbc:sqlite:databasefile.sqlite', 
			'org.sqlite.JDBC' )
		sql.execute("drop table if exists person")
		sql.execute("create table person (id integer, name string)")

		def people = sql.dataSet("person")
		people.add(id:1, name:"leo")
		people.add(id:2,name:'yui')

		sql.eachRow("select * from person") {  
			println("id=${it.id}, name= ${it.name}") 
		}

	}
} 
