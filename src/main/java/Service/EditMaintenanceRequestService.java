package Service;

import Model.EssentialServiceRequest;
import Model.NonEssentialServiceRequest;
import Model.ServiceRequest;
import Repository.ServiceRequestRepository;

public class EditMaintenanceRequestService {
     final ServiceRequestRepository requestRepository;

     public EditMaintenanceRequestService(ServiceRequestRepository requestRepository) {
          this.requestRepository = requestRepository;
     }
     public ServiceRequest update(ServiceRequest serviceRequest, boolean isEssential){
          int serviceRequestID = serviceRequest.getServiceRequestID();
          String description = serviceRequest.getDescription();
          String status = serviceRequest.getStatus();
          if(isEssential){
               EssentialServiceRequest serviceRequest = new EssentialServiceRequest(0, description, true);
               return requestRepository.update(serviceRequest);
          }
          else{
               NonEssentialServiceRequest serviceRequest = new NonEssentialServiceRequest(0, description);
               return requestRepository.update(serviceRequest);
          }
     }
}
