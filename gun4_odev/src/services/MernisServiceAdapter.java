package services;

import java.rmi.RemoteException;

import abstracts.GamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {
	public boolean CheckIfRealPerson(Gamer gamer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getName().toUpperCase(),
					gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());

		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return false;
	}
}