//Copyright (C) 2016 The Android Open Source Project
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.

package com.googlesource.gerrit.plugins.lfs.s3;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.eclipse.jgit.lfs.server.LargeFileRepository;
import org.eclipse.jgit.lfs.server.LfsProtocolServlet;

@Singleton
public class LfsApiServlet extends LfsProtocolServlet {
  private static final long serialVersionUID = 1L;

  private final S3LargeFileRepository repository;

  @Inject
  LfsApiServlet(S3LargeFileRepository repository) {
    this.repository = repository;
  }

  @Override
  protected LargeFileRepository getLargeFileRepository() {
    return repository;
  }
}