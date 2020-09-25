package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PatientReader {
	public List<Patient> readFromFile(String filename) throws IOException {
		List<Patient> patients = new ArrayList<>();
		InputStream inputStream = getClass().getResourceAsStream(filename);

		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		String line;
		while ((line = br.readLine()) != null) {
			String[] data = line.split(",", -1);

			LevelMeasure internalTemperature = LevelMeasure.valueOf(data[0]);
			LevelMeasure surfaceTemperature = LevelMeasure.valueOf(data[1]);
			QualityMeasure oxygenSaturation = QualityMeasure.valueOf(data[2]);
			LevelMeasure bloodPressure = LevelMeasure.valueOf(data[3]);
			StabilityMeasure surfaceTemperatureStability = StabilityMeasure.valueOf(data[4]);
			StabilityMeasure internalTemperatureStability = StabilityMeasure.valueOf(data[5]);
			StabilityMeasure bloodPressureStability = StabilityMeasure.valueOf(data[6]);
			DischargeDecision dischargeDecision = DischargeDecision.valueOf(data[8]);

			Patient patient = new Patient(internalTemperature, surfaceTemperature, oxygenSaturation, bloodPressure,
					surfaceTemperatureStability, internalTemperatureStability, bloodPressureStability, dischargeDecision);
			patients.add(patient);
		}

		return patients;
	}
}