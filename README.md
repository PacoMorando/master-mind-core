# Master Mind Application Core

### Index
- **[Application development](#application-development)**
- **[Documentation](#documentation)**
  - **[Domain Model](#domain-model)**
  - **[Use Case](#use-case)**
  - **[Context Diagram](#context-diagram)**
  - **[Colaboration Diagram 'Open Case'](#colaboration-diagram-open-case)**
  - **[Colaboration Diagram 'ProposeCopmbination Case'](#colaboration-diagram-proposecombination-case)**
  - **[Architecture](#architecture)**
  - **[View Analysis Diagram](#view-analysis-diagram)**
  - **[Controllers Analysis Diagram](#controllers-analysis-diagram)**
  - **[DAOs Analysis Diagram](#daos-analysis-diagram)**
  - **[Models Analysis Diagram](#models-analysis-diagram)**

## Application development


The core of the application was developed in Java. This module contains the model logic and a layer of controllers that are responsible for controlling the flow of program execution, as well as managing data entry and exit of the application.  
The core of the application is agnostic to thetechnologies of view and persistence, which is why controllers are coupled to interfaces of the view and persistence layers (DAO), within same component, which must be implemented by each corresponding technology.

The application coreis packaged to be imported as a maven dependency.  
This component exposes two interfaces, one for the view technology and another for the persistence.



![core component](docs/master_mind_core_component.svg)

## Documentation


### Domain Model
![Doman Model diagram](docs/domain_model/domain-mode-core.svg)


### Use Case
![Use Case diagram](docs/use_case/use-case-core.svg)


### Context Diagram
![Context diagram](docs/context/context-core.svg)


### Colaboration Diagram 'Open Case'
![Colaboration diagram 'Open Case'](docs/colaboration-open/colaboration-propose-combination-core.svg)


### Colaboration Diagram 'ProposeCombination Case'
![Colaboration diagram 'ProposeCombination Case'](docs/colaboration_propose_combination/colaboration-propose-combination-core.svg)


### Architecture
![Architecture diagram](docs/architecture-analysis/analysis-architecture-core.svg)


### View Analysis Diagram
![View Analysis diagram](docs/architecture-views-analysis/analysis-views-core.svg)


### Controllers Analysis Diagram
![Controllers Analysis diagram](docs/architecture-controllers-analysis/analysis-controllers-core.svg)


### DAOs Analysis Diagram
![DAOs Analysis diagram](docs/architecture-dao-analysis/analysis-dao-core.svg)


### Models Analysis Diagram
![Models Analysis diagram](docs/architecture-models-analysis/analysis-models-core.svg)
