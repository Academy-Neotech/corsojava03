package srl.neotech.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import srl.neotech.model.Aereo;

@Component
public class AereoDAO {

	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	
	public void addAereo(Aereo aereo) {
		MapSqlParameterSource parameters=new MapSqlParameterSource();
		parameters.addValue("id", aereo.getId());
		parameters.addValue("nome", aereo.getNome());
		parameters.addValue("numPasseggeri", aereo.getNumPasseggeri());
		jdbcTemplate.update("INSERT INTO AEREO(id,nome,num_passeggeri) VALUES (:id, :nome, :numPasseggeri);",parameters);	
	}
	
	public int getNumeroAerei() {
		MapSqlParameterSource parameters=new MapSqlParameterSource();
		Integer result= jdbcTemplate.queryForObject("SELECT COUNT(*) as numero FROM AEREO;",parameters,Integer.class);
		return result;
	}
	
	public Aereo getAereo(String idAereo) {
		MapSqlParameterSource parameters=new MapSqlParameterSource();
		parameters.addValue("idAereo", idAereo);
		List<Aereo> aerei= jdbcTemplate.query("SELECT * FROM AEREO WHERE ID= :idAereo;",parameters,
			(rs, rowNum) -> new Aereo(rs.getString("id"),rs.getString("nome"),rs.getInt("num_passeggeri")));
		
		if(aerei.size()>0)
		     return aerei.get(0);
		else return null;
	}
}
