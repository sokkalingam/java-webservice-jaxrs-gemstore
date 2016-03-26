package models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model {
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public static <T extends Model> Map<Integer, T> getMapFromList(List<T> list) {
		Map<Integer, T> map = new HashMap<Integer, T>();
		for (int i = 0; i < list.size(); i++) {
			T model = list.get(i);
			model.setId(i + 1);
			map.put(model.getId(), model);
		}
		return map;
	}
}
