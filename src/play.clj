(use 'cms.datomic.core)

(init)

(cms.data/setup)

(require '[cms.domain.author :as au] '[datomic.api :as api])

(pprint (au/find-all))