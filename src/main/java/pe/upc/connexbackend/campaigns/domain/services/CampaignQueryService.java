package pe.upc.connexbackend.campaigns.domain.services;

import pe.upc.connexbackend.campaigns.domain.model.aggregates.Campaign;
import pe.upc.connexbackend.campaigns.domain.model.queries.GetAllCampaignsQuery;
import pe.upc.connexbackend.campaigns.domain.model.queries.GetCampaignsByDateRangeQuery;

import java.util.List;

public interface CampaignQueryService {
        List<Campaign> handle(GetAllCampaignsQuery query);
        List<Campaign> handle(GetCampaignsByDateRangeQuery query);

}