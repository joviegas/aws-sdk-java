/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.healthlake;

import javax.annotation.Generated;

import com.amazonaws.services.healthlake.model.*;

/**
 * Interface for accessing HealthLake asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.healthlake.AbstractAmazonHealthLakeAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon HealthLake is a HIPAA eligibile service that allows customers to store, transform, query, and analyze their
 * data in a consistent fashion in the cloud.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonHealthLakeAsync extends AmazonHealthLake {

    /**
     * <p>
     * Creates a datastore that can ingest and export FHIR data.
     * </p>
     * 
     * @param createFHIRDatastoreRequest
     * @return A Java Future containing the result of the CreateFHIRDatastore operation returned by the service.
     * @sample AmazonHealthLakeAsync.CreateFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/CreateFHIRDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFHIRDatastoreResult> createFHIRDatastoreAsync(CreateFHIRDatastoreRequest createFHIRDatastoreRequest);

    /**
     * <p>
     * Creates a datastore that can ingest and export FHIR data.
     * </p>
     * 
     * @param createFHIRDatastoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFHIRDatastore operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.CreateFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/CreateFHIRDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFHIRDatastoreResult> createFHIRDatastoreAsync(CreateFHIRDatastoreRequest createFHIRDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFHIRDatastoreRequest, CreateFHIRDatastoreResult> asyncHandler);

    /**
     * <p>
     * Deletes a datastore.
     * </p>
     * 
     * @param deleteFHIRDatastoreRequest
     * @return A Java Future containing the result of the DeleteFHIRDatastore operation returned by the service.
     * @sample AmazonHealthLakeAsync.DeleteFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DeleteFHIRDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFHIRDatastoreResult> deleteFHIRDatastoreAsync(DeleteFHIRDatastoreRequest deleteFHIRDatastoreRequest);

    /**
     * <p>
     * Deletes a datastore.
     * </p>
     * 
     * @param deleteFHIRDatastoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFHIRDatastore operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.DeleteFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DeleteFHIRDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFHIRDatastoreResult> deleteFHIRDatastoreAsync(DeleteFHIRDatastoreRequest deleteFHIRDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFHIRDatastoreRequest, DeleteFHIRDatastoreResult> asyncHandler);

    /**
     * <p>
     * Gets the properties associated with the FHIR datastore, including the datastore ID, datastore ARN, datastore
     * name, datastore status, created at, datastore type version, and datastore endpoint.
     * </p>
     * 
     * @param describeFHIRDatastoreRequest
     * @return A Java Future containing the result of the DescribeFHIRDatastore operation returned by the service.
     * @sample AmazonHealthLakeAsync.DescribeFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRDatastore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFHIRDatastoreResult> describeFHIRDatastoreAsync(DescribeFHIRDatastoreRequest describeFHIRDatastoreRequest);

    /**
     * <p>
     * Gets the properties associated with the FHIR datastore, including the datastore ID, datastore ARN, datastore
     * name, datastore status, created at, datastore type version, and datastore endpoint.
     * </p>
     * 
     * @param describeFHIRDatastoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFHIRDatastore operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.DescribeFHIRDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRDatastore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFHIRDatastoreResult> describeFHIRDatastoreAsync(DescribeFHIRDatastoreRequest describeFHIRDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFHIRDatastoreRequest, DescribeFHIRDatastoreResult> asyncHandler);

    /**
     * <p>
     * Displays the properties of a FHIR import job, including the ID, ARN, name, and the status of the datastore.
     * </p>
     * 
     * @param describeFHIRImportJobRequest
     * @return A Java Future containing the result of the DescribeFHIRImportJob operation returned by the service.
     * @sample AmazonHealthLakeAsync.DescribeFHIRImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFHIRImportJobResult> describeFHIRImportJobAsync(DescribeFHIRImportJobRequest describeFHIRImportJobRequest);

    /**
     * <p>
     * Displays the properties of a FHIR import job, including the ID, ARN, name, and the status of the datastore.
     * </p>
     * 
     * @param describeFHIRImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFHIRImportJob operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.DescribeFHIRImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFHIRImportJobResult> describeFHIRImportJobAsync(DescribeFHIRImportJobRequest describeFHIRImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFHIRImportJobRequest, DescribeFHIRImportJobResult> asyncHandler);

    /**
     * <p>
     * Lists all FHIR datastores that are in the user’s account, regardless of datastore status.
     * </p>
     * 
     * @param listFHIRDatastoresRequest
     * @return A Java Future containing the result of the ListFHIRDatastores operation returned by the service.
     * @sample AmazonHealthLakeAsync.ListFHIRDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFHIRDatastoresResult> listFHIRDatastoresAsync(ListFHIRDatastoresRequest listFHIRDatastoresRequest);

    /**
     * <p>
     * Lists all FHIR datastores that are in the user’s account, regardless of datastore status.
     * </p>
     * 
     * @param listFHIRDatastoresRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFHIRDatastores operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.ListFHIRDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ListFHIRDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFHIRDatastoresResult> listFHIRDatastoresAsync(ListFHIRDatastoresRequest listFHIRDatastoresRequest,
            com.amazonaws.handlers.AsyncHandler<ListFHIRDatastoresRequest, ListFHIRDatastoresResult> asyncHandler);

    /**
     * <p>
     * Begins a FHIR Import job.
     * </p>
     * 
     * @param startFHIRImportJobRequest
     * @return A Java Future containing the result of the StartFHIRImportJob operation returned by the service.
     * @sample AmazonHealthLakeAsync.StartFHIRImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartFHIRImportJobResult> startFHIRImportJobAsync(StartFHIRImportJobRequest startFHIRImportJobRequest);

    /**
     * <p>
     * Begins a FHIR Import job.
     * </p>
     * 
     * @param startFHIRImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFHIRImportJob operation returned by the service.
     * @sample AmazonHealthLakeAsyncHandler.StartFHIRImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartFHIRImportJobResult> startFHIRImportJobAsync(StartFHIRImportJobRequest startFHIRImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartFHIRImportJobRequest, StartFHIRImportJobResult> asyncHandler);

}
