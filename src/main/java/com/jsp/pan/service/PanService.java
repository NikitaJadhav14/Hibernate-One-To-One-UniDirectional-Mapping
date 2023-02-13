package com.jsp.pan.service;

import com.jsp.pan.dao.*;
import com.jsp.pan.dto.*;

public class PanService {

	PanDao PanDao = new PanDao();

	public Pan createPan(Pan pan) {
		return PanDao.createPan(pan);
	}

	public Pan getPanById(int id) {
		return PanDao.getPanByID(id);
	}

	public Pan deletePanById(int id) {
		return PanDao.deletePan(id);
	}

	public Pan updatePan(int id, String PanNo) {

		return PanDao.updatePan(id, PanNo);
	}

}
