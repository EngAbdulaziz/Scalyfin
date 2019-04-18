listApp.service('listService', function ($q, $http) {
    /****** Daily *******/
    this.getListResult = function () {
        return $http.get('localhost:8083/scalyfin/unitType/v1/').then(function (response) {
                return response.data;
            },
            function (errResponse) {
                return $q.reject(errResponse);
            });
    }
});
