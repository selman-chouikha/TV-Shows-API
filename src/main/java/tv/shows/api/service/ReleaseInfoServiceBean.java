package tv.shows.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tv.shows.api.model.ReleaseInfo;
import tv.shows.api.repository.ReleaseInfoRepository;

public class ReleaseInfoServiceBean implements ReleaseInfoService {

	@Autowired
	private ReleaseInfoRepository releaseInfoRepository;
	@Override
	public ReleaseInfo saveReleaseInfo(ReleaseInfo ri) {
		return releaseInfoRepository.save(ri);
	}

	@Override
	public List<ReleaseInfo> listReleaseInfo() {
		return releaseInfoRepository.findAll();
	}

}
