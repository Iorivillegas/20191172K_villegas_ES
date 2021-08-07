package uni.edu.pe.dto.rest;


import lombok.Data;
import uni.edu.pe.dto.ReporteTabla;

import java.util.List;

@Data
public class RespuestaDelReporteTabla {
    private List<ReporteTabla> reportes;

	public List<ReporteTabla> getReportes() {
		return reportes;
	}

	public void setReportes(List<ReporteTabla> reportes) {
		this.reportes = reportes;
	}
}