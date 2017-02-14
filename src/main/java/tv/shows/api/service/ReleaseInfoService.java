package tv.shows.api.service;

import java.util.List;

import tv.shows.api.model.ReleaseInfo;

public interface ReleaseInfoService {
	public ReleaseInfo saveReleaseInfo(ReleaseInfo ri);
	public List<ReleaseInfo> listReleaseInfo();
	

}
